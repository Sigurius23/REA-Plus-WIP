.class final Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;",
        "",
        "<init>",
        "()V",
        "yDiffBetweenCenters",
        "",
        "view1",
        "Landroid/view/View;",
        "view2",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$yDiffBetweenCenters(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;Landroid/view/View;Landroid/view/View;)F
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/internal/ChannelViewHolder$Companion;->yDiffBetweenCenters(Landroid/view/View;Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method private final yDiffBetweenCenters(Landroid/view/View;Landroid/view/View;)F
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    add-int/2addr v1, v0

    int-to-float v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p1, v1

    add-float/2addr p1, v0

    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v2

    add-int/2addr v2, v0

    int-to-float v0, v2

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v1

    add-float/2addr p2, v0

    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    return p1
.end method
