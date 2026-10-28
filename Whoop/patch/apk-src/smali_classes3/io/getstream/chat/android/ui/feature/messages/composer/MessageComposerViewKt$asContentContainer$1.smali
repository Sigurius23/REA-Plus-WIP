.class public final Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt;->asContentContainer(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;)Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001aH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0007R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0007R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0007R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0007\u00a8\u0006\u001b"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;",
        "childCount",
        "",
        "center",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "getCenter",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "centerOverlap",
        "getCenterOverlap",
        "leading",
        "getLeading",
        "trailing",
        "getTrailing",
        "header",
        "getHeader",
        "footer",
        "getFooter",
        "asView",
        "Landroid/view/View;",
        "findViewByKey",
        "key",
        "",
        "getChildAt",
        "index",
        "iterator",
        "",
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
.field final synthetic $this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

.field private final childCount:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x6

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->childCount:I

    return-void
.end method

.method public static final synthetic access$getChildAt(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;I)Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->getChildAt(I)Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getChildCount$p(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;)I
    .locals 0

    iget p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->childCount:I

    return p0
.end method

.method private final getChildAt(I)Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 1

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->getFooter()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->getHeader()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->getTrailing()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->getLeading()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->getCenterOverlap()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->getCenter()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final asView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->getRoot()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final findViewByKey(Ljava/lang/String;)Landroid/view/View;
    .locals 2

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;)V

    :goto_0
    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;->next()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object v1

    invoke-interface {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getCenter()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerContent:Landroid/widget/FrameLayout;

    const-string v1, "centerContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb3/d3;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCenterOverlap()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerOverlapContent:Landroid/widget/FrameLayout;

    const-string v1, "centerOverlapContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb3/d3;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFooter()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->footerContent:Landroid/widget/FrameLayout;

    const-string v1, "footerContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb3/d3;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getHeader()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->headerContent:Landroid/widget/FrameLayout;

    const-string v1, "headerContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb3/d3;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLeading()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->leadingContent:Landroid/widget/FrameLayout;

    const-string v1, "leadingContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb3/d3;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTrailing()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;->$this_asContentContainer:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->trailingContent:Landroid/widget/FrameLayout;

    const-string v1, "trailingContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb3/d3;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1$iterator$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;)V

    return-object v0
.end method
