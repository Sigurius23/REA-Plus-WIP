.class public final Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0003R \u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR#\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;",
        "Landroidx/lifecycle/w1;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onCleared",
        "Landroidx/lifecycle/u0;",
        "",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
        "_attachmentGalleryItemsLiveData",
        "Landroidx/lifecycle/u0;",
        "Landroidx/lifecycle/p0;",
        "attachmentGalleryItemsLiveData",
        "Landroidx/lifecycle/p0;",
        "getAttachmentGalleryItemsLiveData",
        "()Landroidx/lifecycle/p0;",
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
.field private final _attachmentGalleryItemsLiveData:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field private final attachmentGalleryItemsLiveData:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    new-instance v0, Landroidx/lifecycle/u0;

    invoke-direct {v0}, Landroidx/lifecycle/p0;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;->_attachmentGalleryItemsLiveData:Landroidx/lifecycle/u0;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;->attachmentGalleryItemsLiveData:Landroidx/lifecycle/p0;

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->INSTANCE:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->registerAttachmentGalleryItemsObserver()V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel$1;-><init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic access$get_attachmentGalleryItemsLiveData$p(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;)Landroidx/lifecycle/u0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;->_attachmentGalleryItemsLiveData:Landroidx/lifecycle/u0;

    return-object p0
.end method


# virtual methods
.method public final getAttachmentGalleryItemsLiveData()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryViewModel;->attachmentGalleryItemsLiveData:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final onCleared()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->INSTANCE:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->unregisterAttachmentGalleryItemsObserver()V

    invoke-super {p0}, Landroidx/lifecycle/w1;->onCleared()V

    return-void
.end method
