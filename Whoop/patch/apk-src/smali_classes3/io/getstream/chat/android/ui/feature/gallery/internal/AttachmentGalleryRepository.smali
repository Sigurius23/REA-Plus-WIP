.class public final Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u000b\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u0003R\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;",
        "",
        "<init>",
        "()V",
        "Lec3/l;",
        "",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
        "getAttachmentGalleryItems",
        "()Lec3/l;",
        "attachmentGalleryItems",
        "Ll83/a0;",
        "setAttachmentGalleryItems",
        "(Ljava/util/List;)V",
        "registerAttachmentGalleryItemsObserver",
        "unregisterAttachmentGalleryItemsObserver",
        "Ljava/util/List;",
        "",
        "attachmentGalleryItemsObserverCount",
        "I",
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;

.field private static attachmentGalleryItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
            ">;"
        }
    .end annotation
.end field

.field private static attachmentGalleryItemsObserverCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->INSTANCE:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;

    sget-object v0, Lm83/y;->w:Lm83/y;

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItems:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getAttachmentGalleryItems$p()Ljava/util/List;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItems:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final getAttachmentGalleryItems()Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository$getAttachmentGalleryItems$1;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method public final registerAttachmentGalleryItemsObserver()V
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItemsObserverCount:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItemsObserverCount:I

    return-void
.end method

.method public final setAttachmentGalleryItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachmentGalleryItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItems:Ljava/util/List;

    return-void
.end method

.method public final unregisterAttachmentGalleryItemsObserver()V
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItemsObserverCount:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItemsObserverCount:I

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    sput-object v0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryRepository;->attachmentGalleryItems:Ljava/util/List;

    :cond_0
    return-void
.end method
