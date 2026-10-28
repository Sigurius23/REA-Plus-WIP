.class public final Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B9\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "fileAttachmentHeight",
        "",
        "fileAttachmentWidth",
        "imageAttachmentHeight",
        "imageAttachmentWidth",
        "quotedImageRadius",
        "<init>",
        "(IIIII)V",
        "getFileAttachmentHeight",
        "()I",
        "getFileAttachmentWidth",
        "getImageAttachmentHeight",
        "getImageAttachmentWidth",
        "getQuotedImageRadius",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;


# instance fields
.field private final fileAttachmentHeight:I

.field private final fileAttachmentWidth:I

.field private final imageAttachmentHeight:I

.field private final imageAttachmentWidth:I

.field private final quotedImageRadius:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->fileAttachmentHeight:I

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->fileAttachmentWidth:I

    iput p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->imageAttachmentHeight:I

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->imageAttachmentWidth:I

    iput p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->quotedImageRadius:I

    return-void
.end method


# virtual methods
.method public final getFileAttachmentHeight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->fileAttachmentHeight:I

    return v0
.end method

.method public final getFileAttachmentWidth()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->fileAttachmentWidth:I

    return v0
.end method

.method public final getImageAttachmentHeight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->imageAttachmentHeight:I

    return v0
.end method

.method public final getImageAttachmentWidth()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->imageAttachmentWidth:I

    return v0
.end method

.method public final getQuotedImageRadius()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->quotedImageRadius:I

    return v0
.end method
