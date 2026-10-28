.class public final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply$Creator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Creator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;
    .locals 2

    .line 1
    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;

    sget-object v1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;-><init>(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)V

    return-object v0
.end method

.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply$Creator;->createFromParcel(Landroid/os/Parcel;)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)[Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;
    .locals 0

    .line 1
    new-array p1, p1, [Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;

    return-object p1
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    new-array p1, p1, [Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryActivity$AttachmentOptionResult$Reply;

    return-object p1
.end method
