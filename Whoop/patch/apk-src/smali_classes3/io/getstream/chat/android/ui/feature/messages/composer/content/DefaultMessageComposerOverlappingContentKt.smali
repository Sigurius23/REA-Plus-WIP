.class public final Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u000b2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\n\"\u0014\u0010\u0011\u001a\u00020\u00088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u0018\u0010\u0016\u001a\u00020\u0006*\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroid/view/View;",
        "Landroid/graphics/Rect;",
        "out",
        "Ll83/a0;",
        "getRectInWindow",
        "(Landroid/view/View;Landroid/graphics/Rect;)V",
        "",
        "milliseconds",
        "",
        "formatMillis",
        "(I)Ljava/lang/String;",
        "Landroid/widget/ImageView;",
        "colorResId",
        "setImageColorRes",
        "(Landroid/widget/ImageView;I)V",
        "action",
        "actionToString",
        "TAG",
        "Ljava/lang/String;",
        "Landroid/view/ViewParent;",
        "getId",
        "(Landroid/view/ViewParent;)I",
        "id",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "OverlappingContent"


# direct methods
.method public static final synthetic access$actionToString(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->actionToString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$formatMillis(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->formatMillis(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRectInWindow(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->getRectInWindow(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method public static final synthetic access$setImageColorRes(Landroid/widget/ImageView;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->setImageColorRes(Landroid/widget/ImageView;I)V

    return-void
.end method

.method private static final actionToString(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, "ACTION_UNKNOWN"

    return-object p0

    :cond_0
    const-string p0, "ACTION_CANCEL"

    return-object p0

    :cond_1
    const-string p0, "ACTION_MOVE"

    return-object p0

    :cond_2
    const-string p0, "ACTION_UP"

    return-object p0

    :cond_3
    const-string p0, "ACTION_DOWN"

    return-object p0
.end method

.method private static final formatMillis(I)Ljava/lang/String;
    .locals 1

    div-int/lit16 p0, p0, 0x3e8

    div-int/lit8 v0, p0, 0x3c

    rem-int/lit8 p0, p0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x2

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%02d:%02d"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final getId(Landroid/view/ViewParent;)I
    .locals 1

    instance-of v0, p0, Landroid/view/View;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method private static final getRectInWindow(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    aget v1, v0, v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    const/4 v2, 0x1

    aget v3, v0, v2

    iput v3, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v3, v1

    iput v3, p1, Landroid/graphics/Rect;->right:I

    aget v0, v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    add-int/2addr p0, v0

    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    return-void
.end method

.method private static final setImageColorRes(Landroid/widget/ImageView;I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
