.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0014\u0018\u0000 $2\u00020\u0001:\u0001$BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;",
        "",
        "progressIcon",
        "Landroid/graphics/drawable/Drawable;",
        "giphyIcon",
        "placeholderIcon",
        "imageBackgroundColor",
        "",
        "giphyType",
        "Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;",
        "scaleType",
        "Landroid/widget/ImageView$ScaleType;",
        "sizingMode",
        "Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;",
        "width",
        "height",
        "dimensionRatio",
        "",
        "<init>",
        "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILio/getstream/chat/android/ui/common/utils/GiphyInfoType;Landroid/widget/ImageView$ScaleType;Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;IIF)V",
        "getProgressIcon",
        "()Landroid/graphics/drawable/Drawable;",
        "getGiphyIcon",
        "getPlaceholderIcon",
        "getImageBackgroundColor",
        "()I",
        "getGiphyType",
        "()Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;",
        "getScaleType",
        "()Landroid/widget/ImageView$ScaleType;",
        "getSizingMode",
        "()Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;",
        "getWidth",
        "getHeight",
        "getDimensionRatio",
        "()F",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle$Companion;

.field public static final NO_GIVEN_DIMENSION_RATIO:F = -1.0f

.field public static final NO_GIVEN_HEIGHT:I = -0x1

.field public static final SQUARE_DIMENSION_RATIO:F = 1.0f


# instance fields
.field private final dimensionRatio:F

.field private final giphyIcon:Landroid/graphics/drawable/Drawable;

.field private final giphyType:Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;

.field private final height:I

.field private final imageBackgroundColor:I

.field private final placeholderIcon:Landroid/graphics/drawable/Drawable;

.field private final progressIcon:Landroid/graphics/drawable/Drawable;

.field private final scaleType:Landroid/widget/ImageView$ScaleType;

.field private final sizingMode:Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

.field private final width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ILio/getstream/chat/android/ui/common/utils/GiphyInfoType;Landroid/widget/ImageView$ScaleType;Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;IIF)V
    .locals 1

    const-string v0, "progressIcon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "giphyIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placeholderIcon"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "giphyType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scaleType"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sizingMode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->giphyIcon:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->imageBackgroundColor:I

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->giphyType:Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;

    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->scaleType:Landroid/widget/ImageView$ScaleType;

    iput-object p7, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->sizingMode:Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    iput p8, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->width:I

    iput p9, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->height:I

    iput p10, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->dimensionRatio:F

    return-void
.end method


# virtual methods
.method public final getDimensionRatio()F
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->dimensionRatio:F

    return v0
.end method

.method public final getGiphyIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->giphyIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getGiphyType()Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->giphyType:Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->height:I

    return v0
.end method

.method public final getImageBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->imageBackgroundColor:I

    return v0
.end method

.method public final getPlaceholderIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->placeholderIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getProgressIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->progressIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->scaleType:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public final getSizingMode()Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->sizingMode:Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->width:I

    return v0
.end method
