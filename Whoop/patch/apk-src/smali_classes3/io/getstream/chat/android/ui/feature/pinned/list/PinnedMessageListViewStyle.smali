.class public final Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/helper/ViewStyle;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;",
        "Lio/getstream/chat/android/ui/helper/ViewStyle;",
        "backgroundColor",
        "",
        "emptyStateDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "messagePreviewStyle",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "<init>",
        "(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V",
        "getBackgroundColor",
        "()I",
        "getEmptyStateDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "getMessagePreviewStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;


# instance fields
.field private final backgroundColor:I

.field private final emptyStateDrawable:Landroid/graphics/drawable/Drawable;

.field private final messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle$Companion;

    return-void
.end method

.method public constructor <init>(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V
    .locals 1

    const-string v0, "emptyStateDrawable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messagePreviewStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->copy(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    return v0
.end method

.method public final component2()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-object v0
.end method

.method public final copy(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;
    .locals 1

    const-string v0, "emptyStateDrawable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messagePreviewStyle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;-><init>(ILandroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    iget v3, p1, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v3, p1, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBackgroundColor()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    return v0
.end method

.method public final getEmptyStateDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getMessagePreviewStyle()Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v2, v0, v1}, Lnh3/a;->a(Landroid/graphics/drawable/Drawable;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->backgroundColor:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->emptyStateDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;->messagePreviewStyle:Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "PinnedMessageListViewStyle(backgroundColor="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", emptyStateDrawable="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messagePreviewStyle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
