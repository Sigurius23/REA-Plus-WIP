.class final Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;
.super Landroidx/recyclerview/widget/z1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaDateScrollListener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u001a\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0011R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011R$\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;",
        "Landroidx/recyclerview/widget/z1;",
        "",
        "spanCount",
        "Lkotlin/Function0;",
        "positionChangeThreshold",
        "Ll83/a0;",
        "onVisibleItemChanged",
        "<init>",
        "(ILc93/a;Lc93/a;)V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "dx",
        "dy",
        "onScrolled",
        "(Landroidx/recyclerview/widget/RecyclerView;II)V",
        "I",
        "Lc93/a;",
        "value",
        "lastVisibleItemPosition",
        "getLastVisibleItemPosition",
        "()I",
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
.field private lastVisibleItemPosition:I

.field private final onVisibleItemChanged:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final positionChangeThreshold:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final spanCount:I


# direct methods
.method public constructor <init>(ILc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "positionChangeThreshold"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onVisibleItemChanged"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->spanCount:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->positionChangeThreshold:Lc93/a;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->onVisibleItemChanged:Lc93/a;

    return-void
.end method


# virtual methods
.method public final getLastVisibleItemPosition()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->lastVisibleItemPosition:I

    return v0
.end method

.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    const-string p2, "recyclerView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->positionChangeThreshold:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ge p1, v0, :cond_1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result p1

    iget v0, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->spanCount:I

    rem-int/2addr p1, v0

    if-nez p1, :cond_0

    invoke-virtual {p2}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result p2

    sub-int p1, p2, p1

    :goto_0
    iget p2, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->spanCount:I

    add-int/2addr p3, p2

    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    move-result p3

    :cond_1
    iget p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->lastVisibleItemPosition:I

    if-eq p1, p3, :cond_2

    iput p3, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->lastVisibleItemPosition:I

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$MediaDateScrollListener;->onVisibleItemChanged:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
