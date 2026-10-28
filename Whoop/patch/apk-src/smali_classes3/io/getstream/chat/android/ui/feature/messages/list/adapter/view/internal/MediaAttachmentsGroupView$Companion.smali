.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;",
        "",
        "<init>",
        "()V",
        "Landroidx/constraintlayout/widget/p;",
        "Landroid/view/View;",
        "view",
        "",
        "isQuarter",
        "Ll83/a0;",
        "setupMinHeight",
        "(Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V",
        "",
        "MAX_HEIGHT_PERCENTAGE",
        "D",
        "",
        "MAX_PREVIEW_COUNT",
        "I",
        "MIN_HEIGHT_PX",
        "",
        "STROKE_WIDTH",
        "F",
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

.method public static final synthetic access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->setupMinHeight(Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    return-void
.end method

.method private final setupMinHeight(Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V
    .locals 0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    if-eqz p3, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->access$getMIN_HEIGHT_PX$cp()I

    move-result p3

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->access$getMIN_HEIGHT_PX$cp()I

    move-result p3

    mul-int/lit8 p3, p3, 0x2

    :goto_0
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object p1

    iget-object p1, p1, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iput p3, p1, Landroidx/constraintlayout/widget/l;->c0:I

    return-void
.end method
