.class final Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$SharedMediaSpaceItemDecorator;
.super Landroidx/recyclerview/widget/q1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SharedMediaSpaceItemDecorator"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView$SharedMediaSpaceItemDecorator;",
        "Landroidx/recyclerview/widget/q1;",
        "<init>",
        "()V",
        "Landroid/graphics/Rect;",
        "outRect",
        "Landroid/view/View;",
        "view",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "parent",
        "Landroidx/recyclerview/widget/k2;",
        "state",
        "Ll83/a0;",
        "getItemOffsets",
        "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V",
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V
    .locals 3

    const-string v0, "outRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x3

    rem-int/2addr v0, v1

    const/4 v2, 0x2

    if-nez v0, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->access$getMEDIA_ITEM_SPACE$cp()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->access$getMEDIA_ITEM_SPACE$cp()I

    move-result v0

    div-int/2addr v0, v2

    iput v0, p1, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_0
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    rem-int/2addr v0, v1

    if-ne v0, v2, :cond_1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->access$getMEDIA_ITEM_SPACE$cp()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->access$getMEDIA_ITEM_SPACE$cp()I

    move-result v0

    div-int/2addr v0, v2

    iput v0, p1, Landroid/graphics/Rect;->left:I

    goto :goto_0

    :cond_1
    invoke-static {}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->access$getMEDIA_ITEM_SPACE$cp()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->access$getMEDIA_ITEM_SPACE$cp()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    iput v0, p1, Landroid/graphics/Rect;->right:I

    invoke-static {}, Lio/getstream/chat/android/ui/feature/gallery/overview/MediaAttachmentGridView;->access$getMEDIA_ITEM_SPACE$cp()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    iput v0, p1, Landroid/graphics/Rect;->left:I

    :goto_0
    invoke-virtual {p4}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v0

    rem-int/2addr v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v0

    rem-int/2addr v0, v1

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result p4

    sub-int/2addr p4, v0

    if-lt p2, p4, :cond_3

    invoke-virtual {p3}, Landroid/view/View;->getHeight()I

    move-result p2

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    div-int/2addr p3, v1

    sub-int/2addr p2, p3

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :cond_3
    return-void
.end method
